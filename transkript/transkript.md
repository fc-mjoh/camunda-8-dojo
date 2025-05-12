# Camunda 8 Coding Dojo

## 1 - Rest Connector

Vorwort:

Kurz Zusammenfassung Camunda 7 vs. Camunda 8:

| **Camunda 7** | **Camunda 8** |
| :--- | :--- |
| Monolith | Cloud, Microservices (vertikal skalierbar: Resourcen erhöhen) |

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| Zeebe-Prozess-Engine | Für die Verarbeitung und das Ausführen von Workflows verantwortlich |
| Zeebe-Broker | Ist für die Verwaltung und Verteilung von Aufgaben (innerhalb des Clusters) zuständig. |
| Zeebe-Client | Ermöglicht die Interaktion mit der Zeebe-Engine.  |

Projekt-Template anschauen:

  * Dependencies
  * application.yaml

Doings:

  1. Wiremock starten
  2. Modeler starten

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01](1_camunda-8-dojo.png) | - Startpunkt mit Rest Outbund Connector verbinden, Erklärung Kreise  |
| ![01](1.1_camunda-8-dojo.png) | - Wiremock konfigurieren<br/> Fortsetzung siehe Bild 3 |
| ![01](1.2_camunda-8-dojo.png) |   |

## 2 - Gateway, Jobworker und Error (End&Start) Event

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01]( 2_camunda-8-dojo-2.png) | Exclusive Gateway -> Default Weg, Einstick ExceptionHandling,  |
| ![01]( 2.1_camunda-8-dojo-2.png) | Feel  Friendly Enough Expression Language soll einfach verständlich sein, sowohl für Fachler als auch entwickler |
| ![01]( 2.2_camunda-8-dojo-2.png) | tbd |
| ![01]( 2.3_camunda-8-dojo-2.png) | tbd |
| ![01]( BuyCoffeeWorker.png) | Wir implementieren unseren ersten Jobworker, kurzer Exkurs External Task Pattern -> Camunda 7, wir kommen noch später dazu was das bedeutet (Talk) |

## 3 - User Task

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01]( 3_camunda-8-dojo-3.png) | Der Mitarbeiter soll entscheiden, ob Kaffee bestellt werden soll |
| ![01]( 3.1_camunda-8-dojo-3.png) | Wir erstellen uns eine Form |
| ![01]( 3.2_camunda-8-dojo-3.png) |  |
| ![01]( 3.3_camunda-8-dojo-3.png) |  |


## 4 - Gateway, Jobworker

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01]( 4_camunda-8-dojo-4.png) | BPMN um Gateway und Jobworker ergänzen |
| ![01]( 4.1_camunda-8-dojo-4.png) | Die zwei Wege sind eindeutig, kein Default.  |
| ![01]( 4.2_camunda-8-dojo-4.png) |  |
| ![01]( OrderCoffeeWorker.png) |  |

## 5 - Message (Throw und Start)

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01]( 5_camunda-8-dojo-6.png) | Die Lanes haben keine Auswirkung |
| ![01]( 5.1_camunda-8-dojo-6.png) | Siehe Code, Vergleich External Task in Camunda 7 -> wir kümmmern uns |
| ![01](NotifyEmployeeWorker.png) | tbd |
| ![01]( 5.2_camunda-8-dojo-6.png) | tbd |


## 6 - DMN

| **Doing** | **Beschreibung \/ Schritte** |
| :--- | :--- |
| ![01]( 6_camunda-8-dojo-6.png) | Beschreibung |
| ![01]( 6.1_camunda-8-dojo-6.png) | Decision Model & Notation |
| ![01]( 6.2_camunda-8-dojo-6.png) |  |
| ![01]( 6.3_camunda-8-dojo-6.png) |  |
