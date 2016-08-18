/*
 * Copyright (C) 2016 Brian Wernick
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

package com.devbrackets.android.exomedia.type;

import com.google.android.exoplayer.ExoPlayer;

/**
 * States associated with the current media playback
 * state for the {@link com.devbrackets.android.exomedia.EMAudioPlayer}
 * and {@link com.devbrackets.android.exomedia.ui.widget.EMVideoView}
 *
 * TODO finish documentation, we may also want playing, paused states, error vs completion
 *      see https://developer.android.com/reference/android/media/MediaPlayer.html#State_Diagram
 *
 *      IDLE
 *      RELEASED (after release())
 *      ERROR
 *      COMPLETED
 *      PREPARING
 *      PREPARED
 *      PLAYING
 *      STOPPED
 *      PAUSED
 */
public interface PlaybackState {
    /**
     * Media has neither been prepared or is preparing
     */
    int IDLE = ExoPlayer.STATE_IDLE;

    /**
     * The media is being prepared for playback
     */
    int PREPARING = ExoPlayer.STATE_PREPARING;

    /**
     * The media has been prepared but isn't currently playing
     */
    int READY = ExoPlayer.STATE_READY;
    int BUFFERING = ExoPlayer.STATE_BUFFERING;
    int ENDED = ExoPlayer.STATE_ENDED;
}
