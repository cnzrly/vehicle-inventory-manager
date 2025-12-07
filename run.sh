#!/bin/bash

# Color definitions
GREEN='\033[0;32m'
NC='\033[0m' # No Color

echo -e "${GREEN}Stopping existing containers...${NC}"
docker-compose down

echo -e "${GREEN}Building and starting containers...${NC}"
docker-compose up -d --build

echo -e "${GREEN}Waiting for services to be healthy...${NC}"
# Simple wait (optionally wait for healthcheck)
sleep 2

echo -e "${GREEN}Containers status:${NC}"
docker ps

echo -e "${GREEN}Showing logs (Press Ctrl+C to exit logs)...${NC}"
docker-compose logs -f
