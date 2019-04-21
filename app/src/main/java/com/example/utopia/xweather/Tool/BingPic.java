package com.example.utopia.xweather.Tool;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BingPic
{
    @SerializedName("images")
    public List<BaseBing> images;

    public class BaseBing
    {
        //这里的链接还需要加上微软的http://cn.bing.com在前面
        @SerializedName("url")
        public String bingBasePicUrl;
    }
}
