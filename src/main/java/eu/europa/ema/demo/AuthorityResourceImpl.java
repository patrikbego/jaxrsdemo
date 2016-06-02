package eu.europa.ema.demo;

import eu.europa.ema.res.DemoResponseInfo;
import eu.europa.ema.res.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by begop on 01/06/2016.
 */

@Path("/task/authorise")
@RequestScoped
public class AuthorityResourceImpl implements AuthoriseResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidateResourceImpl.class);

    public void assign(String taskId) {
        LOGGER.info("API assign call successfully executed - with parameters {}", taskId);
    }

    public void activate(String userId) {
        LOGGER.info("API activate call successfully executed - with parameters {}", userId);
    }

    public ResponseInfo<String> inactivate(String userId) {
        LOGGER.info("API inactivate call successfully executed - with parameters {}", userId);
        return new DemoResponseInfo(userId);
    }

    public void complete(String taskId, String validateTaskData) {
        LOGGER.info("API complete call successfully executed - with parameters {}, {}", taskId, validateTaskData);
    }

    public void save(String validateTaskData) {
        LOGGER.info("API save call successfully executed - with parameters {}", validateTaskData);
    }

    public ResponseInfo<String> remove(Long considerationId) {
        LOGGER.info("API remove call successfully executed - with parameters {}", considerationId);
        return new DemoResponseInfo(considerationId.toString());
    }

    public ResponseInfo<String> share(List<Long> considerationIds) {
        LOGGER.info("API remove call successfully executed - with parameters {}", considerationIds.get(0));
        return new DemoResponseInfo(considerationIds.get(0).toString());
    }

    public String findByCTNumber(String ctNumber) {
        LOGGER.info("API findByCTNumber call successfully executed - with parameters {} ", ctNumber);
        return "CT number: " + ctNumber;
    }
}
