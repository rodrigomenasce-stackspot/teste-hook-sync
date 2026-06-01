const test = require('node:test');
const assert = require('node:assert');
const { greet } = require('../src/greet');

test('greet returns a hello message', () => {
  assert.strictEqual(greet('world'), 'Hello, world!');
});

test('greet interpolates the name', () => {
  assert.strictEqual(greet('NX'), 'Hello, NX!');
});
