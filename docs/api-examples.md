# API examples

Create a clinic:
```http
POST /api/clinics
Content-Type: application/json
{"name":"North Clinic","address":"12 Lake Road"}
```

Create an appointment:
```http
POST /api/appointments
Content-Type: application/json
{"patientName":"Asha Kumar","clinicianName":"Dr Rao","scheduledAt":"2026-10-20T10:30:00"}
```

Create an invoice:
```http
POST /api/invoices
Content-Type: application/json
{"appointmentId":1,"amount":850.00}
```
