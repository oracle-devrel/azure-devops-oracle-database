#!/bin/bash
# Copyright (c) 2024 Oracle and/or its affiliates.
# Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

kubectl create cm db-metrics-tns-admin \
    --from-file=cwallet.sso \
    --from-file=ewallet.p12 \
    --from-file=ewallet.pem \
    --from-file=keystore.jks \
    --from-file=ojdbc.properties \
    --from-file=sqlnet.ora \
    --from-file=tnsnames.ora \
    --from-file=truststore.jks
