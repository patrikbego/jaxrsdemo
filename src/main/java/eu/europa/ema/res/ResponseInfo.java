package eu.europa.ema.res;

import java.util.List;

public abstract class ResponseInfo<D> {

	private D data;

	private List<Violation> violations;

	protected ResponseInfo() {

	}

	public List<Violation> getViolations() {
		return violations;
	}

	public void setViolations(List<Violation> violations) {
		this.violations = violations;
	}

	protected ResponseInfo(D data) {
		this.data = data;
	}

	/**
	 * Get the key of the newly created resource. The key may have been
	 * generated, or passed in as part of the service call.
	 * 
	 * @return The key of newly created resource.
	 */
	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

}