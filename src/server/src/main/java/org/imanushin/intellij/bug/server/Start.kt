package org.imanushin.intellij.bug.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@SpringBootApplication
open class DraftServer {
}

@ConfigurationProperties("org.imanushin.intellij.bug.server")
@Component
open class ConfigurationOfTheCommonModule {
    open var stringProperty: String? = null
}

fun main(args: Array<String>) {

}