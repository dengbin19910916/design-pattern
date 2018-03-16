package com.runoob.adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {

        switch (audioType.toLowerCase()) {
            case "mp3": // 播放 mp3 音乐文件的内置支持
                System.out.println("Playing mp3 file. Name: " + fileName);
                break;
            // mediaAdapter 提供了播放其他文件格式的支持
            case "vlc":
            case "mp4":
                MediaAdapter mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid media. " + audioType + " format not supported");

        }
    }
}
