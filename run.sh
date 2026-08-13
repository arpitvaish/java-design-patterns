#!/usr/bin/env bash
# Compile and run any pattern's demo.
# Usage:
#   ./run.sh 01-singleton-pattern
#   ./run.sh            # runs every pattern's Demo one after another
set -euo pipefail

run_one() {
  local dir="$1"
  local src="patterns/$dir/src"
  if [ ! -d "$src" ]; then
    echo "No such pattern: $dir"; return 1
  fi
  echo "==================================================================="
  echo "  $dir"
  echo "==================================================================="
  local out
  out="$(mktemp -d)"
  javac -d "$out" "$src"/*.java
  java -cp "$out" Demo
  rm -rf "$out"
  echo
}

if [ "${1:-}" != "" ]; then
  run_one "$1"
else
  for d in patterns/*/; do
    run_one "$(basename "$d")"
  done
fi
