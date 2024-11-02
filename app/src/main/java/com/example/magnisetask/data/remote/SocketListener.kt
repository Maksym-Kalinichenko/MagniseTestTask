package com.example.magnisetask.data.remote

interface SocketListener {
    fun onNewMessage(message: String)
    fun onError(error: String)
}
