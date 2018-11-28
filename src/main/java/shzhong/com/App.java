package shzhong.com;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("测试");

        new WebSocketServer("10.94.14.200", 9999).start();
    }
}

