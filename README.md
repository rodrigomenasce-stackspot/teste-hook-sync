# empty-test-repo

Nx monorepo with two hello-world apps.

## Layout

```
apps/
  node-app/     Node.js HTTP server (port 3000)
  spring-api/   Spring Boot REST API on Java 21 (port 8080)
```

## Run

```bash
# Node app
npx nx serve node-app
npx nx test node-app

# Spring Boot API (requires JDK 21 and Maven on PATH)
npx nx serve spring-api
npx nx test spring-api

# Both
npx nx run-many -t build
npx nx run-many -t test
```

demo-8a336802
