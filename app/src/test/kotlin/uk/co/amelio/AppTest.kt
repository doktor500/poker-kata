package uk.co.amelio

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class AppTest {
    @Test
    fun test() {
        assertThat(App().greeting).isEqualTo("Hello World!")
    }
}