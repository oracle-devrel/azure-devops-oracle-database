#!/bin/bash
# Copyright (c) 2024 Oracle and/or its affiliates.
# Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

kubectl create secret generic db-secret \
--from-literal=username=admin \
--from-literal=password=Welcome12345

kubectl apply -f metrics-exporter-deployment.yaml

kubectl apply -f metrics-exporter-service.yaml

kubectl apply -f metrics-exporter-servicemonitor.yaml

#kubectl port-forward deployment/prometheus-grafana 3000
#kubectl port-forward service/prometheus-operated 9090
#kubectl port-forward deployment/metrics-exporter 9161
