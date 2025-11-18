package com.ifpr.androidapptemplate.baseclasses

data class Tarefas(

    var tarrefa_realizada: Boolean = false,
    var descricao: String?= null,
    var tarefa: String? = null,
    var data: String?= null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
