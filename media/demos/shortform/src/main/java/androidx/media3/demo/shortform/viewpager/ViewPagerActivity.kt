/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package androidx.media3.demo.shortform.viewpager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.demo.shortform.MainActivity
import androidx.media3.demo.shortform.MediaItemDatabase
import androidx.media3.demo.shortform.R
import androidx.viewpager2.widget.ViewPager2

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var viewPagerView: ViewPager2
    private lateinit var adapter: ViewPagerMediaAdapter
    private var numberOfPlayers = 3
    private var mediaItemDatabase = MediaItemDatabase()

    companion object {
        private const val TAG = "ViewPagerActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        numberOfPlayers = intent.getIntExtra(MainActivity.NUM_PLAYERS_EXTRA, numberOfPlayers)
        Log.d(TAG, "Using a pool of $numberOfPlayers players")
        viewPagerView = findViewById(R.id.viewPager)
        viewPagerView.offscreenPageLimit = 1
        viewPagerView.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    adapter.onPageSelected(position)
                }
            }
        )
    }

    override fun onStart() {
        super.onStart()
        adapter = ViewPagerMediaAdapter(mediaItemDatabase, numberOfPlayers, this)
        viewPagerView.adapter = adapter
    }

    override fun onStop() {
        adapter.onDestroy()
        super.onStop()
    }
}
