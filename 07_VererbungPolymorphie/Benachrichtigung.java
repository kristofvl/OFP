/** Benachrichtigungsdienst-Interface in Java
    Erstelle ein Nachrichtensystem für eine App, die Benachrichtigungen
    auf verschiedene Arten senden kann (E-Mail, SMS, Push). Jeder Dienst
    implementiert ein gemeinsames Verhalten, aber mit unterschiedlichen Details.
    */

import javax.swing.*; // JOptionPane

interface Notification {  // Interface für eine Notification
  void sendNotification(String message);
}

class NotificationManager {
  private Notification service;
  public NotificationManager(Notification service) {
    this.service = service;
  }
  public void notifyUser(String message) {
    service.sendNotification(message);
  }
}

class Email implements Notification {  // Notification via email
  public void sendNotification(String message) {
    JOptionPane.showMessageDialog(null, message,
             "E-Mail Notification", JOptionPane.INFORMATION_MESSAGE);
  }
}

class SMS implements Notification {  // Notification via SMS
  public void sendNotification(String message) {
    JOptionPane.showMessageDialog(null, message,
             "SMS Notification", JOptionPane.INFORMATION_MESSAGE);
  }
}

class Push implements Notification {  // Notification via Push
  public void sendNotification(String message) {
    JOptionPane.showMessageDialog(null, message,
             "Push Notification", JOptionPane.INFORMATION_MESSAGE);
  }
}

class Benachrichtigung {
  public static void main(String[] s) {
    // Erstelle eine Notification Service für E-Mail, SMS, und Push.
    // Erstelle ein Notificationmanager und send dann mit den manager
    // diese Notifications via E-Mail: "Welcome to our App!",
    // via SMS: "Verification code: 1234" und via Push:
    // "You have a new message!"

  }
}
