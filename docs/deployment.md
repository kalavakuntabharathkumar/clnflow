# Deployment notes

- Store database credentials in your hosting platform's secret manager; never commit production secrets.
- Build the container with `docker build -t clinicflow .`.
- For AWS, provision an RDS PostgreSQL instance and an EC2/container host, restrict inbound database access to the application security group, and terminate TLS at a load balancer or reverse proxy.
- Before production, add authentication/authorization, database migrations (Flyway), audit logging, rate limits, backups, and integration tests against PostgreSQL.
