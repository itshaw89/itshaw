package com.itshaw.blog.util;

import java.io.IOException;
import java.nio.file.*;

/**
 * Function:
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2017/8/11
 * Time: 16:28
 */
public class Test {

        public static void main(String[] args) throws IOException, InterruptedException {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Paths.get("C:").register(watcher,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            while (true) {
                WatchKey key = watcher.take();
                for (WatchEvent<?> event: key.pollEvents()) {
                    System.out.println(event.context() + " comes to " + event.kind());
                }

                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        }


}
