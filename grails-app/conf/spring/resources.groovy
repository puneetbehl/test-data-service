
// Place your Spring DSL code here
beans = {

    restAuthenticationSuccessHandler(example.LoginAuthenticationSucessHandler) {
        testService = ref('testService')
    }

    testBean(example.TestBean)
}
