# ClinicFlow — Appointment & Billing Backend

Spring Boot REST API starter for multi-clinic appointment and billing workflows.

## Stack
Java 17 · Spring Boot 3.3 · Spring Data JPA · PostgreSQL · JUnit 5 · Mockito · Docker · GitHub Actions · OpenAPI

## Run locally
1. Install Java 17 and Maven, or use Docker Compose.
2. `docker compose up --build`
3. API base URL: `http://localhost:8080/api`; Swagger UI: `http://localhost:8080/swagger-ui.html`.

Without Docker, set `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, and `SPRING_DATASOURCE_PASSWORD`, then run `mvn spring-boot:run`.

## Main endpoints
- `GET/POST /api/clinics`
- `GET/POST /api/appointments`
- `GET/PATCH /api/appointments/{id}/status`
- `GET/POST /api/invoices`
- `GET /api/health`

This repository is a practical starter implementation; production claims and scale figures in a resume should only be used if independently measured and true.
