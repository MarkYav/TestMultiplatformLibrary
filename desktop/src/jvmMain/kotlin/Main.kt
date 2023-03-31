import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.markyav.box.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
