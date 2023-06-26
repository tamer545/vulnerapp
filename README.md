# Vulnerapp
-- A Vulnerable Sample Spring Boot Application

## Anforderungen
✅ Verwendung von korrekten REST-Verben.

✅ Implementierung einer Authentifizierungslösung (z.B. BasicAuth).

✅ Enforce RBAC (z.B. User- und Admin-Services unterscheiden).

✅ Aktivieren von CSRF-Protection

❌ und Erklärung, warum diese Implementation funktioniert.

✅ Implementierung einer sicheren Passwort-Speicherung (Hashing, Passwortregeln).

✅ Strikte Inputvalidierung (für REST-Endpunkte und Datenbank).

❌ Behebung der initialen Sicherheitslücken (SQLi, XSS, CSRF).

✅ Implementierung von securityrelevanten (Unit-)Tests.

## Selbstevaluation
Insgesamt konnte ich erfolgreich 7 von 9 Anforderungen erfüllen und schätze meine Leistung auf eine Note von 4.7 ein. Die größte Herausforderung bestand darin, die Sicherheitslücken zu beheben und dabei das grundlegende Verhalten der Applikation beizubehalten. Ich hatte im Vergleich zu früheren Projekten bei diesem einigermassen viele Schwierigkeiten. Oliver konnte mir jedoch bei einigen Sachen weiterhelfen.
Mit Hilfe konnte ich jedoch effektive Sicherheitsmaßnahmen wie Input-Validierung, Zugriffskontrollen und Verschlüsselung implementieren. Obwohl nicht alle Anforderungen erfüllt werden konnten, habe ich einen wertvollen Beitrag zur Sicherheit der Applikation geleistet und wichtige Erfahrungen in der Sicherheitsimplementierung gesammelt. Für zukünftige Projekte werde ich mein Wissen und meine Fähigkeiten im Sicherheitsbereich weiterentwickeln, um noch effektiver zu sein.

Bei der Entwicklung meiner Applikation habe ich verschiedene Sicherheitsmechanismen implementiert, um die Sicherheit zu verbessern. Hier sind die Sicherheitsmechanismen, die ich in meiner Applikation umgesetzt habe:

Verwendung von korrekten REST-Verben: Durch die Verwendung der richtigen REST-Verben stelle ich sicher, dass die Aktionen, die von den Benutzern ausgeführt werden, angemessen und sicher sind. Dadurch wird das Risiko von unsicheren oder unerlaubten Operationen reduziert.

Implementierung von Basic Auth: Ich habe Basic Auth als Authentifizierungslösung in meiner Applikation implementiert. Diese Methode erfordert, dass Benutzer ihre Anmeldedaten (Benutzername und Passwort) über HTTP-Header bei jeder Anfrage senden. Dadurch stelle ich sicher, dass nur authentifizierte Benutzer Zugriff auf die Applikation haben und unautorisierte Zugriffe von Benutzern mit böswilligen Absichten verhindert werden.

Enforce RBAC (Rollenbasierte Zugriffskontrolle): Ich habe eine rollenbasierte Zugriffskontrolle (RBAC) implementiert, um die Funktionalitäten der Applikation zwischen Benutzern und Administratoren zu unterscheiden. Dadurch wird gewährleistet, dass nur berechtigte Benutzer auf bestimmte Dienste oder Funktionen zugreifen können.

Aktivierung von CSRF-Protection: Um Cross-Site Request Forgery (CSRF)-Angriffe zu verhindern, habe ich CSRF-Protection aktiviert. Dadurch wird sichergestellt, dass Anfragen nur von vertrauenswürdigen Quellen stammen und nicht von Angreifern manipuliert wurden.

Implementierung einer sicheren Passwort-Speicherung: Ich speichere Passwörter sicher, indem ich Hashing-Algorithmen verwende und Passwortregeln implementiere. Dadurch wird verhindert, dass Passwörter in Klartext gespeichert werden und erhöht die Sicherheit der Benutzerkonten.

Strikte Inputvalidierung: Ich habe eine strikte Inputvalidierung sowohl für REST-Endpunkte als auch für die Datenbank implementiert. Dadurch werden potenziell schädliche oder nicht autorisierte Eingaben blockiert und die Sicherheit der Applikation verbessert.

Implementierung von securityrelevanten (Unit-)Tests: Um sicherzustellen, dass die Sicherheitsmechanismen korrekt funktionieren, habe ich securityrelevante Tests, einschließlich Unit-Tests, implementiert. Dadurch können potenzielle Sicherheitslücken oder Schwachstellen frühzeitig erkannt und behoben werden.

Diskussion über weitere mögliche und sinnvolle Sicherheitsmechanismen:

Neben den bereits implementierten Sicherheitsmechanismen könnte ich weitere Maßnahmen in Betracht ziehen, um die Sicherheit meiner Applikation weiter zu verbessern. Hier sind einige mögliche Ergänzungen:

Implementierung von JWT (JSON Web Tokens): Die Verwendung von JWTs als alternative Authentifizierungsmethode könnte die Sicherheit erhöhen. JWTs sind verschlüsselte und signierte Tokens, die verwendet werden können, um Benutzer zu authentifizieren. Durch die Verwendung von JWTs könnte ich die Sicherheit der Übertragung von Authentifizierungsinformationen weiter stärken.

Einführung von Captcha: Die Implementierung von Captcha-Mechanismen kann helfen, automatisierte Angriffe und Bots zu erkennen und abzuwehren. Captchas stellen sicher, dass die Interaktionen von Benutzern menschlich sind und nicht von automatisierten Skripten oder Bots durchgeführt werden.