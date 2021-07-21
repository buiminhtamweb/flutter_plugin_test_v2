package com.github.buiminhtamweb.flutterplugintestv2.services

import com.github.buiminhtamweb.flutterplugintestv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
