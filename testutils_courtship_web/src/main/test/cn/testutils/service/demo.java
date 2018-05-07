package cn.testutils.service;

import org.junit.Test;

import java.io.*;

/**
 * Created by ZLS on 2018/5/2.
 */
public class demo {
    int i;
    boolean MainFlag = true;


    @Test
    public void ATOB() throws IOException {
        File f = new File("d:\\Java");
        if (!(f.exists() && f.isDirectory()))
            return;
        File[] s = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });
        File fb = new File("d:\\dir");
        if (!(fb.exists() && fb.isDirectory()))
            fb.mkdir();
        for (File val : s) {
            FileInputStream inputStream = new FileInputStream(val);
            FileOutputStream out = new FileOutputStream(new File(f.getName().replace(".java", "dir")));
            copy(inputStream, out);
            inputStream.close();
            out.close();
        }

    }


    public void copy(FileInputStream in, FileOutputStream out) throws IOException {
        int len = -1;
        byte[] b = new byte[1024];
        while ((len = in.read(b)) > -1) {
            out.write(b, 0, len);
        }
    }


    @Test
    public synchronized void fun() {
        new Thread(() -> {
            for (int j = 0; j < 50; j++) {
                mainPool();
            }
        }).start();
        for (int j = 0; j < 50; j++) {
            FollowPool();
        }
    }

    public synchronized void mainPool() {
        if (MainFlag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j = 1; j <= 100; j++) {
            System.out.println("main" + j);
        }
        this.notify();
        MainFlag = !MainFlag;
    }

    public synchronized void FollowPool() {
        if (!MainFlag) {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        for (int j = 1; j <= 10; j++) {
            System.out.println("follow" + j);
        }
        this.notify();
        MainFlag = !MainFlag;
    }

}
