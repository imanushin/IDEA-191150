package org.imanushin.intellij.bug.common

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties

@SpringBootApplication
open class CommonConfiguration {
}


@ConfigurationProperties("org.imanushin.intellij.bug.common")
open class ConfigurationOfTheCommonModule{
    open var stringProperty: String? = null
}