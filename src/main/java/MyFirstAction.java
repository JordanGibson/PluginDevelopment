import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import com.intellij.notification.Notification;

import java.util.Objects;

public class MyFirstAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        new Notification(Notifications.SYSTEM_MESSAGES_GROUP_ID,
                String.format("The current project is %s", e.getProject().getName()),
                String.format("The current working directory is %s", e.getProject().getProjectFilePath()),
                NotificationType.INFORMATION)
                .notify(null);
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        super.update(e);
        e.getPresentation().setEnabled(Objects.nonNull(e.getProject()));
    }
}