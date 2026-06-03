# empty-test-repo

Nx monorepo with two hello-world apps — one Node.js, one Java — both built and
tested through Nx.

## Layout

```
apps/
  node-app/     Node.js HTTP server (port 3000), bundled with esbuild
  spring-api/   Spring Boot REST API on Java 21 (port 8080), built with Maven
```

## Prerequisites

- Node.js >= 20 and npm (run `npm install` once)
- JDK 21 (the Spring Boot app uses the Maven wrapper `./mvnw`, no global Maven needed)

## Build

```bash
# Build everything
npx nx run-many -t build

# Build a single app
npx nx build node-app
npx nx build spring-api
```

## Test

```bash
npx nx run-many -t test
npx nx test node-app
npx nx test spring-api
```

## Serve

```bash
npx nx serve node-app     # http://localhost:3000
npx nx serve spring-api   # http://localhost:8080
```

## Project graph

```bash
npx nx graph
```

## Targets

| Project     | build                       | test               | serve                 |
| ----------- | --------------------------- | ------------------ | --------------------- |
| `node-app`  | esbuild bundle → `dist/`    | `node --test`      | `node src/index.js`   |
| `spring-api`| `./mvnw package` → `target/`| `./mvnw test`      | `./mvnw spring-boot:run` |

Both projects use Nx's `nx:run-commands` executor, so build/test outputs are
cached by Nx.

demo-7c8c18fe

demo-556914b8

demo-d8c2da53

demo-d2848b8c

demo-6cfa7338

demo-6ba0a0b6

demo-3e1b1a28
