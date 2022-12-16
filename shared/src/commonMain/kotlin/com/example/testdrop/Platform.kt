package com.example.testdrop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform