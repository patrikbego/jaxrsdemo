package eu.europa.ema.res;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PagingInfo implements Comparable<PagingInfo> {

	public static final int NO_LIMIT = -1;
	public static final long NO_OFFSET = 0;
	
	public static final PagingInfo ALL = new PagingInfo(NO_OFFSET, NO_LIMIT);
	
	private final long offset;
	
	private final int limit;

    public PagingInfo(long offset, int limit) {
		this.offset = offset;
		this.limit = limit;
	}
	
	public long getOffset() {
		return offset;
	}
	
	public int getLimit() {
		return limit;
	}

	public long getPageNumber() {
		if ( limit > NO_LIMIT ) {
			return (offset/limit) + 1;
		}

		if ( limit == 0 ) {
			return 0L;
		}

		return 1;
	}

	public int compareTo(PagingInfo that) {
		if ( this.offset > that.offset ) return 1;
		if ( this.offset < that.offset ) return -1;
		// this.offset == that.offset
		if ( this.limit == that.limit ) return 0;
		// this.limit != that.limit
		if ( this.limit == NO_LIMIT || this.limit > that.limit ) return 1;
		if ( that.limit == NO_LIMIT || this.limit < that.limit ) return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object other) {
		if ( other == null ) return false;
		if ( other == this ) return true;
		if ( !(other instanceof PagingInfo) ) return false;
		
		PagingInfo that = (PagingInfo) other;
		
		return this.offset == that.offset && this.limit == that.limit;
	}
	
	@Override
	public int hashCode() {
		return (int) offset;
	}
	
	@Override
	public String toString() {
		return String.format("%d,%d", offset, limit);
	}
	
	private static final Pattern PATTERN  = Pattern.compile("(\\d+)(?:,(-?\\d+))?");
	
	public static final PagingInfo valueOf(String representation) throws IllegalArgumentException {
		if ( representation == null ) {
			return ALL;
		}
		
		Matcher regex = PATTERN.matcher(representation);
		if ( regex.matches() ) {
			long offset = Long.parseLong(regex.group(1));
			int limit = NO_LIMIT;
			if ( regex.groupCount() > 1 ) {
				String limitString = regex.group(2);
				if ( limitString != null ) {
					limit = Integer.parseInt(regex.group(2));
				}
			}
			return new PagingInfo(offset, limit);
		}
		
		throw new IllegalArgumentException("Invalid paging format: " + representation);
	}
}
