pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "JetpackArticle"
include(":app")
include(":app:taskmanagercompose")
include(":app:composequadrant")
include(":app:composebasics")
include(":app:businesscardapp")
