package com.example.messenger_facebook

import com.example.messenger_facebook.model.Message
import com.example.messenger_facebook.model.Room


class Chat {
    var message: Message? = null
    var rooms: ArrayList<Room> = ArrayList()

    constructor(message: Message) {
        this.message = message
    }

    constructor(rooms:ArrayList<Room>) {
        this.rooms = rooms
    }
}