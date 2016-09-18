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

package com.devbrackets.android.exomedia.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.google.android.exoplayer.ExoPlayer.STATE_BUFFERING;
import static com.google.android.exoplayer.ExoPlayer.STATE_ENDED;
import static com.google.android.exoplayer.ExoPlayer.STATE_IDLE;
import static com.google.android.exoplayer.ExoPlayer.STATE_PREPARING;
import static com.google.android.exoplayer.ExoPlayer.STATE_READY;

@IntDef({
       STATE_IDLE,
       STATE_PREPARING,
       STATE_BUFFERING,
       STATE_READY,
       STATE_ENDED
})
@Retention(RetentionPolicy.SOURCE)
public @interface ExoPlayerState {
    //Purposefully left blank
}
