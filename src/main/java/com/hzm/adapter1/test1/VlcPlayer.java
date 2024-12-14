package com.hzm.adapter1.test1;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 VLC 文件。名称: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
