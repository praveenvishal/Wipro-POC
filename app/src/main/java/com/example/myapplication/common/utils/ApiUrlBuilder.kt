package com.example.myapplication.common.utils

import com.example.myapplication.BuildConfig


object ApiUrlBuilder {
    private var APP_BASE_URL = BuildConfig.BASE_URL

    fun setAppUrl(url: String) {
        APP_BASE_URL = url
    }

    private const val TOP_FEEDS   = "s/2iodh4vg0eortkl/facts.json"


    fun getFeedsUrl() = APP_BASE_URL+ TOP_FEEDS
}