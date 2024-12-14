package com.hzm.adapter1.test1;

//MediaPlayer 接口的具体类
public class AudioPlayer implements MediaPlayer{


    @Override
    public void play(String audioType, String fileName) {
        MediaAdapter mediaAdapter;

        // 内置支持播放 mp3 音乐文件
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 mp3 文件。名称: " + fileName);
        }
        // mediaAdapter 提供支持播放其他文件格式
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("无效媒体。" + audioType + " 格式不支持");
        }
    }


}
