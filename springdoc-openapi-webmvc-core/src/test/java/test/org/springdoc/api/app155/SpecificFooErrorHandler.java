package test.org.springdoc.api.app155;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice(assignableTypes = HelloController.class)
public class SpecificFooErrorHandler extends CommonFooErrorHandler {
}
