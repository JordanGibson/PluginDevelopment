import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import com.intellij.notification.Notification;

public class MyFirstAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        new Notification(Notifications.SYSTEM_MESSAGES_GROUP_ID,
                "My first notification",
                "Hello world!", NotificationType.INFORMATION)
                .notify(null);
    }
}
