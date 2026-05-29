const http = require('node:http');
const { greet } = require('./greet');

const port = process.env.PORT || 3000;

const server = http.createServer((req, res) => {
  if (req.url === '/health') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ status: 'ok' }));
    return; 
    
  }

  res.writeHead(200, { 'Content-Type': 'text/plain' });
  res.end(greet('world'));
});

if (require.main === module) {
  server.listen(port, () => {
    console.log(`Listening on http://localhost:${port}`);
  });
}

module.exports = { server };
