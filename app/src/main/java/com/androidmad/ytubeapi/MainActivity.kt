package com.androidmad.ytubeapi

import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestored: Boolean) {
        showShortToast("Youtube Api Initialization Success")
        if (!wasRestored) {
            player?.cueVideo("wKJ9KzGQq0w");
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        showShortToast("Youtube Api Initialization Failure")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yt_pv.initialize("AIzaSyDv-gjtmZh1h9WKwQbp-aySccEFlDkxFuk", this)
    }
}
