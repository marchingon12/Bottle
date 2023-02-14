package com.marchingon12.bottle.ui.common

object Route {
    /*  Graph  */
    const val ROOT = "root"
    const val HOME_GRAPH = "home_graph"
    const val SETTINGS_GRAPH = "settings_graph"

    /*  Screens  */

    // Main
    const val HOME = "home"
    const val DOWNLOADS = "downloads"
    const val SETTINGS = "settings"
    // Settings
    const val ABOUT = "about"
    const val APPEARANCE = "appearance"
    const val DIRECTORY = "directory"
    const val SECURITY = "security"
    const val GENERAL = "general"
    // Inner settings
    const val CREDITS = "credits"
    const val LANGUAGES = "languages"
    const val AUTO_UPDATE = "auto_update"
    const val CHANGELOG = "changelog"

}

infix fun String.arg(arg: String) = "$this/{$arg}"
infix fun String.id(id: Int) = "$this/$id"