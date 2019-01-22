/*
 * PROJECT LICENSE
 *
 * This project was submitted by Lara Martín as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2017 Lara Martín
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.milimehta.rajkotguide;

import android.content.Context;

import java.util.List;

/**
 * Created by lara on 28/8/16.
 */
public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sight_aji_dam_name),
                context.getString(R.string.sight_aji_dam_description),
                context.getString(R.string.sight_aji_dam_address),
                context.getString(R.string.sight_aji_dam_phone),
                context.getString(R.string.sight_aji_dam_schedule),
                context.getString(R.string.sight_aji_dam_price),
                R.drawable.aji_dam
        ));

        list.add(new Location(
                context.getString(R.string.sight_dolls_museum_name),
                context.getString(R.string.sight_dolls_museum_description),
                context.getString(R.string.sight_dolls_museum_address),
                context.getString(R.string.sight_dolls_museum_phone),
                context.getString(R.string.sight_dolls_museum_schedule),
                context.getString(R.string.sight_dolls_museum_price),
                R.drawable.rotary_dolls_museum
        ));

        list.add(new Location(
                context.getString(R.string.sight_temple_name),
                context.getString(R.string.sight_temple_description),
                context.getString(R.string.sight_temple_address),
                context.getString(R.string.sight_temple_phone),
                context.getString(R.string.sight_temple_schedule),
                context.getString(R.string.sight_temple_price),
                R.drawable.swaminarayantemple
        ));

        list.add(new Location(
                context.getString(R.string.sight_watson_museum_name),
                context.getString(R.string.sight_watson_museum_description),
                context.getString(R.string.sight_watson_museum_address),
                context.getString(R.string.sight_watson_museum_phone),
                context.getString(R.string.sight_watson_museum_schedule),
                context.getString(R.string.sight_watson_museum_price),
                R.drawable.watson_museum
        ));

    }
}
