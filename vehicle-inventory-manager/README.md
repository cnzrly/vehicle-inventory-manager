# Vehicle Inventory Manager

A Java-based application for managing vehicle inventory, fully containerized with Docker, PostgreSQL, and Liquibase.

## 🚀 Features

- **Dockerized Environment:** Easy setup with Docker and Docker Compose.
- **PostgreSQL Database:** Persistent data storage.
- **Liquibase:** Automated database schema migration.
- **Secure Configuration:** Uses `.env` files for secret management.
- **Automation:** Includes a `run.sh` script for one-click startup.

## 🛠️ Prerequisites

- [Docker](https://www.docker.com/get-started) installed on your machine.
- [Docker Compose](https://docs.docker.com/compose/install/) installed.

## ⚙️ Configuration

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Start-Java-AZ/vehicle-inventory-manager.git
   cd vehicle-inventory-manager
   ```

2. **Set up Environment Variables:**
   The project uses an `.env` file to manage sensitive credentials. We have provided an example file.
   
   Copy the example file to create your own configuration:
   ```bash
   cp .env.example .env
   ```
   
   You can open `.env` with any text editor to change the default passwords if needed (default: `password`).

## ▶️ How to Run

### Automatic Way (Recommended)
We have provided a helper script to clean, build, and run the application in one go:

```bash
chmod +x run.sh # Only needed once
./run.sh
```

### Manual Way
If you prefer running manual Docker commands:

```bash
# Build and start services
docker-compose up -d --build

# View application logs
docker-compose logs -f app

# View database logs
docker-compose logs -f db
```

## 🗄️ Database

- **Host (Local):** `localhost`
- **Port:** `5438` (Mapped from container port 5432)
- **Database Name:** `postgres`
- **User:** `javad` (or as configured in `.env`)
- **Password:** `password` (or as configured in `.env`)

The database schema is automatically managed by Liquibase on container startup.

## 📂 Project Structure

- `src/main/java`: Java source code.
- `src/main/resources/db/changelog`: Liquibase changelog files.
- `Dockerfile`: Multi-stage Docker build configuration.
- `docker-compose.yml`: Service orchestration.
- `run.sh`: Automation script.
- `.env`: (Not committed) Local environment secrets.
