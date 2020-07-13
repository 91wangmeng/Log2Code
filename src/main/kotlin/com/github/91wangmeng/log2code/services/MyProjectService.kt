package com.github.91wangmeng.log2code.services

import com.intellij.openapi.project.Project
import com.github.91wangmeng.log2code.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
