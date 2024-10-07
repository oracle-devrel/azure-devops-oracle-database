# Build MultiCloud Devops using Azure CI/CD Pipelines with Oracle Database Cloud Services

[![License: UPL](https://img.shields.io/badge/license-UPL-green)](https://img.shields.io/badge/license-UPL-green) [![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=oracle-devrel_azure-devops-oracle-database)](https://sonarcloud.io/dashboard?id=oracle-devrel_azure-devops-oracle-database)

![Architecture](/img/image.png)

## Introduction

This workshop will help you build and understand a comprehensive, multi-cloud DevSecOps Solution.

You will build a CI/CD pipeline in Azure DevOps for a microservice architecture using AKS (Azure Kubernetes Services) and Oracle Database, providing automation, security, and efficiency throughout the development lifecycle. In doing so you will understand, build, test, and deploy a multi-cloud application using Azure Pipelines and Oracle Cloud Database.

The application source code is hosted on Azure DevOps code repository or Github or similar. A user commits changes into the code repository which triggers the CI pipeline. This phase includes running unit tests, integration tests, static code analysis, and also testing of containers within the AKS cluster to verify deployment readiness.

Once testing is complete, the build pipeline creates Docker images and pushes them to the Azure container registry. These build artifacts then initiate the CD pipeline. In the CD phase, the artifacts are deployed to Azure Kubernetes Service (AKS) where end-to-end and systems tests are run to ensure microservices operate correctly within the Kubernetes environment. Staging and production environments, using strategies like blue/green or canary deployments, are then initiated for zero downtime deployment of the new changes.

A key component of this architecture is the Oracle Database Operator, which manages the lifecycle of the Oracle Database, automating tasks such as provisioning, scaling, backups, updates, and maintenance. This integration ensures efficient database management and seamless interaction between the microservices in AKS and the Oracle Database. Microservices securely connect to the Oracle Database over an Interconnect using Azure ExpressRoute and Oracle FastConnect, maintaining a secure and reliable database connection, with credentials managed via Azure Key Vault.

Metrics, logs, and tracing of the entire CI/CD process are observed continuously using tools like Azure Monitor and OCI and Oracle Database's Unified Observability OpenTelemetry framework which provides traces from the entry point of the application residing on Azure, across all subsystems, and into the Oracle Database ensuring the performance and reliability of both the microservices and the database. This approach ensures a robust, efficient, and scalable solution for deploying and managing modern applications in a cloud-native environment.

## Getting Started

- Head over to Oracle [LiveLabs](https://apexapps.oracle.com/pls/apex/r/dbpm/livelabs/view-workshop?wid=3914&clear=RR,180&session=17357364342808)

### Prerequisites  

- A valid email address
- Ability to receive SMS text verification (only if your email isn't recognized)
- You have an Oracle Cloud account.

## URLs
* Nothing at this time

## Contributing
This project is open source.  Please submit your contributions by forking this repository and submitting a pull request!  Oracle appreciates any contributions that are made by the open source community.

## License
Copyright (c) 2024 Oracle and/or its affiliates.

Licensed under the Universal Permissive License (UPL), Version 1.0.

See [LICENSE](LICENSE) for more details.

ORACLE AND ITS AFFILIATES DO NOT PROVIDE ANY WARRANTY WHATSOEVER, EXPRESS OR IMPLIED, FOR ANY SOFTWARE, MATERIAL OR CONTENT OF ANY KIND CONTAINED OR PRODUCED WITHIN THIS REPOSITORY, AND IN PARTICULAR SPECIFICALLY DISCLAIM ANY AND ALL IMPLIED WARRANTIES OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY, AND FITNESS FOR A PARTICULAR PURPOSE.  FURTHERMORE, ORACLE AND ITS AFFILIATES DO NOT REPRESENT THAT ANY CUSTOMARY SECURITY REVIEW HAS BEEN PERFORMED WITH RESPECT TO ANY SOFTWARE, MATERIAL OR CONTENT CONTAINED OR PRODUCED WITHIN THIS REPOSITORY. IN ADDITION, AND WITHOUT LIMITING THE FOREGOING, THIRD PARTIES MAY HAVE POSTED SOFTWARE, MATERIAL OR CONTENT TO THIS REPOSITORY WITHOUT ANY REVIEW. USE AT YOUR OWN RISK. 