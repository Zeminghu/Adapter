package com.hzm.adapter1.test1;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 MP4 文件。名称: " + fileName);
    }
}
