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
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_bizz_hotel_name),
                context.getString(R.string.food_bizz_hotel_description),
                context.getString(R.string.food_bizz_hotel_address),
                context.getString(R.string.food_bizz_hotel_phone),
                context.getString(R.string.food_bizz_hotel_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.bizzhotel
        ));

        list.add(new Location(
                context.getString(R.string.food_imperial_palace_name),
                context.getString(R.string.food_imperial_palace_description),
                context.getString(R.string.food_imperial_palace_address),
                context.getString(R.string.food_imperial_palace_phone),
                context.getString(R.string.food_imperial_palace_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.imperial_palace
        ));

        list.add(new Location(
                context.getString(R.string.food_sankalp_restaurant_name),
                context.getString(R.string.food_sankalp_restaurant_description),
                context.getString(R.string.food_sankalp_restaurant_address),
                context.getString(R.string.food_sankalp_restaurant_phone),
                context.getString(R.string.food_sankalp_restaurant_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.sankalp_resturant
        ));

        list.add(new Location(
                context.getString(R.string.food_jassi_de_parathe_name),
                context.getString(R.string.food_jassi_de_parathe_description),
                context.getString(R.string.food_jassi_de_parathe_address),
                context.getString(R.string.food_jassi_de_parathe_phone),
                context.getString(R.string.food_jassi_de_parathe_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.jassideparathe
        ));

    }
}
