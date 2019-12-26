package com.example.motionlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motionlayoutexample.adapters.DummyRecyclerAdapter
import kotlinx.android.synthetic.main.sample_collapsing_animation.*

class MainActivity : AppCompatActivity() {

    val adapter = DummyRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_collapsing_animation)
        scrollable_content.adapter = adapter
    }
}
