package com.andreabonatti92.plugins

import com.andreabonatti92.models.TicTacToeGame
import com.andreabonatti92.socket
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
