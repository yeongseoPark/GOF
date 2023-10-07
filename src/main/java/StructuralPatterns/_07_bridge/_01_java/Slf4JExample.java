package StructuralPatterns._07_bridge._01_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4JExample {
    /* Logging 퍼사드(추상화된 API)를 통해서 로깅 사용, 구현체가 코드에서 드러나진 않음 */
    private static Logger logger = LoggerFactory.getLogger(Slf4JExample.class);

    public static void main(String[] args) {
        logger.info("hello loger");
    }

}
