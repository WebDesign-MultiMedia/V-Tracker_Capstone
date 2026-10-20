# V-Tracker

## Project Description
V-Tracker is a full-stack web application built to give vehicle owners a single, organized place to log and track everything about their vehicles — maintenance and repairs, fuel usage, expenses, insurance information, and core vehicle details.

The purpose of the app is to help users stay proactive about vehicle health instead of relying on memory or scattered paper receipts. Every oil change, transmission fluid replacement, brake pad swap, or major repair gets logged in one place, with supporting photo/video evidence and automatic backups to a Google Spreadsheet for extra security and accessibility. Visual charts turn that raw log data into trends, so users can see spending patterns and stay ahead of upcoming maintenance.

## What This Is Built With
V-Tracker is a full-stack (frontend + backend + database) application, split across two repositories that are combined here:

- **Frontend** — a React single-page application that handles the UI, authentication flow, and data visualization.
- **Backend** — a Java/Spring Boot REST API that handles business logic, persistence, and security.
- **Database** — a relational MySQL database, with H2 available for local/in-memory testing.

### Languages
- JavaScript (JSX) — frontend
- Java — backend
- SQL — database schema and queries

### Frontend Tools & Libraries
- **React 18** + **Vite** — component-based UI and fast dev/build tooling
- **React Router DOM** — client-side routing/navigation
- **Tailwind CSS**, **Bootstrap** / **React-Bootstrap**, **SCSS** — styling
- **Chart.js** / **Recharts** — visual charts for maintenance and expense trends
- **React Big Calendar** — scheduling/calendar views for maintenance tasks
- **React Webcam** — in-browser photo/video capture for logging vehicle condition
- **Google OAuth (@react-oauth/google)** + **jwt-decode** — authentication
- **Axios** / **Fetch API** — HTTP requests to the backend and external APIs
- **Font Awesome**, **Heroicons** — iconography
- **ESLint** — code quality
- Deployed via **Vercel** (live demo) and **GitHub Pages**

### Backend Tools & Libraries
- **Java 22** + **Spring Boot 3** — REST API framework
- **Spring Data JPA** + **Hibernate** — ORM for mapping Java objects to database tables
- **Spring Security** — authentication/authorization on API endpoints
- **Maven** — build and dependency management
- **MySQL** — production relational database
- **H2** — in-memory database for local development/testing

### External Integrations
- **Google Spreadsheets** + **SheetDB** — syncing logs to an external, user-accessible backup

## Key Features
- Secure login/registration, including Google sign-in
- Vehicle profile tracking (make, model, registration/insurance details)
- Maintenance & repair logging with photo/video evidence
- Fuel and expense logging with visual charts and trend tracking
- Insurance information tracking
- Calendar-based scheduling for upcoming maintenance
- Automatic backup of logs to Google Sheets
- Customer support and auto-parts lookup sections

## What This Means for Businesses & Clients
V-Tracker is designed to demonstrate a production-style pattern that's directly reusable for real businesses:

- **Fleet and shop management** — an auto repair shop, rental agency, or small business fleet operator can track maintenance history, costs, and compliance (insurance/registration) across every vehicle in one dashboard instead of paper logs or spreadsheets.
- **Data-driven decisions** — the built-in charts turn raw log entries into spending and maintenance trends, helping a business spot rising repair costs or a vehicle nearing end-of-life before it becomes an expensive breakdown.
- **Reduced liability & better records** — photo/video-backed logs and automatic spreadsheet backups create an audit trail that's useful for insurance claims, warranty disputes, or resale value.
- **Customer-facing self-service** — clients can log in, view their own vehicle's history, and reach support or parts info without a phone call, reducing the workload on staff.
- **Extensible foundation** — because the backend is a standard Spring Boot REST API with a MySQL database, it can be extended with billing, notifications, or multi-tenant support to serve multiple clients/businesses from one deployment.

## Frontend
https://github.com/WebDesign-MultiMedia/FrontEndCap

## Backend
https://github.com/WebDesign-MultiMedia/VehicleDB

## Live Demo
- https://v-tacker.vercel.app/
