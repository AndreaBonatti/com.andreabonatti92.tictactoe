package com.andreabonatti92

import com.andreabonatti92.models.TicTacToeGame
import com.andreabonatti92.plugins.configureMonitoring
import com.andreabonatti92.plugins.configureRouting
import com.andreabonatti92.plugins.configureSerialization
import com.andreabonatti92.plugins.configureSockets
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val game = TicTacToeGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}
