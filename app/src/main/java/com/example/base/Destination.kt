package com.example.base

open class Destination(val route: String) {
    object homePage : Destination("homePage");
    object funcRegister : Destination("funcRegister");
    object registerFuncao : Destination("registerFuncao");
}